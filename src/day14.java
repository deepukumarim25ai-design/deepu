

public class day14 {
    static class Student{
        String name;
        int age;
        String dob;
        String gender;

        /*Student(String name,int age,String dob,String gender){
            this.name=name;
            this.age=age;
            this.dob=dob;
            this.gender=gender;

        }*/
        Student(Builder builder){
            this.name = builder.name;
            this.age = builder.age;
            this.dob = builder.dob;
            this.gender = builder.gender;
        }
        static class Builder{
            private String name;
            private int age;
            private String dob;
            private String gender;

            public Builder name(String nameValue){
                this.name = nameValue;
                return this;
            }
            public Builder age(int ageValue){
                this.age = ageValue;
                return this;
            }
            public Builder dob(String dobValue){
                this.dob = dobValue;
                return this;
            }
            public Builder gender(String genderValue){
                this.gender = genderValue;
                return this;
            }
            public Student build(){
                return new Student(this);
            }
        }
    }
    static void main(){
        Student student = new Student.Builder()
                .name("Deepu")
                .age(18)
                .dob("16-12-2007")
                .gender("Female")
                .build();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.dob);
        System.out.println(student.gender);
    }
}