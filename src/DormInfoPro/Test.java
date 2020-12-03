package DormInfoPro;

public class Test {
    public static void main(String[] args) {
        StudentDeal deal=new StudentDeal();
		Student stu1=deal.findStuByNum("201806060407");
		System.out.println(stu1.name);

        Student[] stu2=deal.findStusByName("樊子睿");
        System.out.println(stu2[0].classname);

        Student[] stu3=deal.findStusByInstitute("电智学院");
        for(int i =0;i<stu3.length;i++)
            System.out.print(stu3[i].name + ' ');

        System.out.println();

        Student[] stu4=deal.findStusByClassname("计算机181班");
        for(int i =0;i<stu4.length;i++)
            System.out.print(stu4[i].name + ' ');

        System.out.println();

        Student[] stu5=deal.findStusByDormId("11-223");
        for(int i =0;i<stu5.length;i++)
            System.out.print(stu5[i].name + ' ');

        System.out.println();

//        Student newstu1=new Student("201906060125","千巩义","男","6-542","电控学院","电信192班");
//        Student newstu2=new Student("201706070811","向梦晨","女","5-332","轻工学院","轻工174班");
//        deal.addStudent(newstu1);
//        deal.delStuByNum("201806060313");
//        deal.updateStu(newstu2);
    }
}
