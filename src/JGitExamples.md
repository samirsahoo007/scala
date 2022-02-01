
Git git = Git.cloneRepository()
  .setURI( "https://github.com/eclipse/jgit.git" )
  .setDirectory( "/path/to/repo" )
  .call();
