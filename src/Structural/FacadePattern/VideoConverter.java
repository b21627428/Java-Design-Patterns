package Structural.FacadePattern;

import java.util.Locale;

public class VideoConverter {

    public String convert(String filename,String format){
        VideoFile videoFile = new VideoFile(filename);
        String sourceCodec = new CodecFactory().extract(videoFile);
        if(format == "mp4"){
            MPGE4CompressionCodec mpge4CompressionCodec = new MPGE4CompressionCodec();
            return mpge4CompressionCodec.fix(sourceCodec);
        }
        return null;
    }

    private static class VideoFile {
        private String filename;
        public VideoFile(String filename) {
            this.filename = filename;
        }

        public String getContent() {
            return "Content";
        }
    }

    private static class CodecFactory {

        public String extract(VideoFile videoFile){
            return videoFile.getContent();
        }
    }

    private static class MPGE4CompressionCodec {
        public String fix(String sourceCodec) {
            return sourceCodec.toLowerCase(Locale.ROOT);
        }
    }
}
