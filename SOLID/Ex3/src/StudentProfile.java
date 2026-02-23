class StudentProfile {

    String rollNo;
    String name;
    double cgr;
    int attendancePct;
    int earnedCredits;
    String disciplinaryFlag;

    StudentProfile(String rollNo,
                   String name,
                   double cgr,
                   int attendancePct,
                   int earnedCredits,
                   String disciplinaryFlag) {

        this.rollNo = rollNo;
        this.name = name;
        this.cgr = cgr;
        this.attendancePct = attendancePct;
        this.earnedCredits = earnedCredits;
        this.disciplinaryFlag = disciplinaryFlag;
    }

    @Override
    public String toString() {
        return name +
                " (CGR=" + String.format("%.2f", cgr) +
                ", attendance=" + attendancePct +
                ", credits=" + earnedCredits +
                ", flag=" + disciplinaryFlag + ")";
    }
}