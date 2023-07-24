interface Downloader{
    fun download()
}

interface Uploader{
    fun upload()
}

class VideoDownloader(val filename: String) : Downloader {
    override fun download() {
        println("filename: $filename is downloaded")
    }

}

class VideoUploader(val filename: String): Uploader{
    override fun upload() {
        println("file name: $filename is uploaded")
    }
}

class FileHandler(val downloader: Downloader, val uploader: Uploader):Downloader by downloader,Uploader by uploader{

}



fun main(){
    val downloader = VideoDownloader("download")
    val uploader = VideoUploader("upload")
    val fileHandler = FileHandler(downloader,uploader)
    fileHandler.download()
    fileHandler.upload()
}