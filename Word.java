package word;

public class Word {
	   private String mDefaulttranslation;

	    private String mMiwoktranslation;

	    public String getmDefaulttranslation() {
	        return mDefaulttranslation;
	    }

	    public String getmMiwoktranslation() {
	        return mMiwoktranslation;
	    }

	    public Word(String DefaultTranslation, String Miwoktranslation){
	        mDefaulttranslation = DefaultTranslation;
	        mMiwoktranslation = Miwoktranslation;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Word w = new Word("one","lutti");
			Word v = new Word("two","utti");
			System.out.println(w.mDefaulttranslation);
			System.out.println(v.mMiwoktranslation);
			
			
	}

}
