import groovy.io.FileType

dir = new File('./old_java_files')
dir.eachFileRecurse(FileType.FILES) { file ->
  newName = "${file.getName().split('\\.')[0]}.groovy"
  file.renameTo(new File(dir.toString()+"/"+newName))
  println file
}
