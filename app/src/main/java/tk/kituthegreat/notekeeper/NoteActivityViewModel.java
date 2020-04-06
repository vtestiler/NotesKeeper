package tk.kituthegreat.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public final static  String ORIGINAL_NOTE_COURSE_ID = "tk.kituthegreat.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public final static  String ORIGINAL_NOTE_TITLE = "tk.kituthegreat.notekeeper.ORIGINAL_NOTE_TITLE";
    public final static  String ORIGINAL_NOTE_TEXT = "tk.kituthegreat.notekeeper.ORIGINAL_NOTE_TEXT";


    public String mOriginalNoteCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);

    }


    public void restoreState(Bundle inState){
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
