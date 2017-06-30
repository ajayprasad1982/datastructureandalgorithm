/**
 * 
 */
package com.structural.adapter;

/**
 * @author aprasa03
 *
 */
public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdaptor;

	/* (non-Javadoc)
	 * @see com.structural.pattern.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType))
		{
			System.out.println("playing the MP3 :"+fileName);
		}else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType))
		{
			mediaAdaptor=new MediaAdapter(audioType);
			mediaAdaptor.play(audioType, fileName);
		}
 
		else
		{
			System.out.println("Invalid audio Type\t"+audioType);
		}
	}

}
