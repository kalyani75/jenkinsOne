import java.io.*
import groovy.io.*
  
  def dir  = new File("/var/lib/jenkins/workspace")
  new File(dir.path+'/kdNewFile.txt').withWriter('utf-8') {
    writer -> 
    	dir.eachFileRecurse(FileType.ANY) { file ->
          if (file.isDirectory()){
            writer.writeLine(file.name)
            println file.name
          }else {
            writer.writeLine(file.name	+ '\t' + file.length() )
          }                
    }
  }
