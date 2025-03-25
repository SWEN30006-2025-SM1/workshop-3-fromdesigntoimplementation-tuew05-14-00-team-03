package com.unimelb.swen30006.workshops;

public class Student {

    public Student() {

    }

    public Submission createSubmission(File data, String note) {
        return new Submission(data, note);
    }

}
