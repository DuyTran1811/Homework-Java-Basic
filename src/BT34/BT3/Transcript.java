package BT34.BT3;
// mo ta thong tin ve bang diem
public class Transcript {
    private String id;
    private float ScoreFactor1;
    private float ScoreFactor2;
    private float ScoreFactor3;
    private float mediumScore;
    private Classification classification;

    public Transcript() {
        id = "";
        ScoreFactor1 = 0;
        ScoreFactor2 = 0;
        ScoreFactor3 = 0;
        mediumScore = 0;
        classification = null;
    }

    public Transcript(String id) {
        this.id = id;
    }

    public Transcript(String id, float scoreFactor1) {
        this(id);
        ScoreFactor1 = scoreFactor1;
    }

    public Transcript(String id, float scoreFactor1, float scoreFactor2) {
        this(id, scoreFactor1);
        ScoreFactor2 = scoreFactor2;
    }

    public Transcript(String id, float scoreFactor1,
                      float scoreFactor2, float scoreFactor3) {
        this(id, scoreFactor1, scoreFactor2);
        ScoreFactor3 = scoreFactor3;
    }

    public Transcript(String id, float scoreFactor1, float scoreFactor2,
                      float scoreFactor3, float mediumScore) {
        this(id, scoreFactor1, scoreFactor2, scoreFactor3);
        this.mediumScore = mediumScore;
    }

    public Transcript(String id, float scoreFactor1, float scoreFactor2,
                      float scoreFactor3, float mediumScore, Classification classification) {
        this(id, scoreFactor1, scoreFactor2, scoreFactor3, mediumScore);
        this.classification = classification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getScoreFactor1() {
        return ScoreFactor1;
    }

    public void setScoreFactor1(float scoreFactor1) {
        ScoreFactor1 = scoreFactor1;
    }

    public float getScoreFactor2() {
        return ScoreFactor2;
    }

    public void setScoreFactor2(float scoreFactor2) {
        ScoreFactor2 = scoreFactor2;
    }

    public float getScoreFactor3() {
        return ScoreFactor3;
    }

    public void setScoreFactor3(float scoreFactor3) {
        ScoreFactor3 = scoreFactor3;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    // phuong thuc tinh diem trung binh
    public void calculatorMinimum() {
        this.mediumScore = (ScoreFactor1 + 2 * ScoreFactor2 + 3 * ScoreFactor3) / 6;
    }

    // phuong thuc xep loai diem
    public void calculatorClassification() {
        if (mediumScore >= 9.0f) {
            classification = Classification.A_PLUS;
        } else if (mediumScore >= 8.0f) {
            classification = Classification.A;
        } else if (mediumScore >= 6.5f) {
            classification = Classification.B;
        } else if (mediumScore >= 5.0f) {
            classification = Classification.C;
        } else if (mediumScore >= 4.0) {
            classification = Classification.D;
        } else {
            classification = Classification.F;
        }
    }
}
