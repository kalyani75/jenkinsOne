import java.io.*
import groovy.io.*
  
  def dir = new File("/var/lib/jenkins/workspace")
  new File(dir.path + '/releasenotes.txt').withWriter('utf-8') {
   	writer ->
    	dir.eachFileRecurse(FileType.ANY) { file ->
          if(file.isDirectory()){
            writer.writeLine(file.name)
            println 'Suuccess -> Dir'+ file.name
          } else {
           	 writer.writeLine('\t'+file.name+'\t'+file.length())
             println 'Suuccess -> File'
          }
  }
}
