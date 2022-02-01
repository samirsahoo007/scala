    val pb: ProcessBuilder = new ProcessBuilder(cmd, args)

    pb.directory(new File("/Users/Aaron/temp/myDir"))
    val log = new File("log")
    pb.redirectErrorStream(true)

    val process = pb.start
    val is = process.getInputStream()
    val buffer = new ArrayBuffer[Byte]()
    var read = is.read().toByte
    while (read != -1) {
      buffer.append(read)
      read = is.read().toByte
    }

    import JavaConversions._
    val s = new String(buffer.toArray[Byte])
    println(s)
