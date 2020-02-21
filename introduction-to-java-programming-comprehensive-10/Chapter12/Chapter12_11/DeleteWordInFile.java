class DeleteWordInFile {
  public static void main(String[] args) {
    
    //Check number of strings passed 
    if (args.length != 2) {   //At least 2 words needed (word that has to be deleted & file name)
      System.out.println("\n\nTry again!\nFor example: java DeleteWordInFile John filename\n\n");
      System.exit(0);
    }


    try {
      EditFileClass test = new EditFileClass(args[0], args[1]);
      test.deleteAllmatch();
        System.out.println("Del All Match");
      test.delTempFile();
        System.out.println("Del Temp File");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}