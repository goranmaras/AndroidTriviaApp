package com.goranm.triviaapp.data;

import com.goranm.triviaapp.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {

    void processFinished(ArrayList<Question> questionArrayList);

}
