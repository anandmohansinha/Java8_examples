package com.java.stream.demo;

public class Student implements Comparable<Student>{

        private int sid; //sort
        private String sname; //sort
        private long phone;
        private String courseName; //Course course;
        private double feePaid; //Fee fee;
        private double feeBal; //sort

        public Student() {}

        public Student(int sid, String sname, long phone, String courseName, double feePaid,double
        feeBal) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.phone = phone;
        this.courseName = courseName;
        this.feePaid = feePaid;
        this.feeBal = feeBal;
        }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(double feePaid) {
        this.feePaid = feePaid;
    }

    public double getFeeBal() {
        return feeBal;
    }

    public void setFeeBal(double feeBal) {
        this.feeBal = feeBal;
    }

    @Override
        public String toString() {
        return " ["  + sname + ", " + courseName + ", " + feePaid + ", " + feeBal +  "]";
        }


    @Override
    public int compareTo(Student stud1) {
        System.out.println("current feePaid: "+feePaid);
        System.out.println(" prev stud1 feePaid: "+ stud1.getFeePaid());

        System.out.println("----------------------------------------");

        //return feePaid>stud1.getFeePaid() ? 1:feePaid<stud1.getFeePaid()?-1:0;

        if(feePaid > stud1.getFeePaid()){
            return -1;
        } else if(feePaid < stud1.getFeePaid()){
            return 1;
        } else {
            return 0;
        }
    }
}
