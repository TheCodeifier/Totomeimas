class Student {
    private String name;
    private String study;
    private String interests;

    public String getName() { return name; }
    public String getStudy() { return study; }
    public String getInterests() { return interests; }

    public void setName(String name) { this.name = name; }
    public void setStudy(String study) { this.study = study; }
    public void setInterests(String interests) { this.interests = interests; }
}

class ProfileFormatter {
    public String format(Student student) {
        return "Naam: " + student.getName() + "\n"
             + "Opleiding: " + student.getStudy() + "\n"
             + "Interesses: " + student.getInterests();
    }
}

class ProfileOutputHandler {
    public void printProfile(String profileText) {
        System.out.println(profileText);
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ali");
        student.setStudy("Informatica");
        student.setInterests("Programmeren, AI, Gaming");

        ProfileFormatter formatter = new ProfileFormatter();
        String profiel = formatter.format(student);

        ProfileOutputHandler outputHandler = new ProfileOutputHandler();
        outputHandler.printProfile(profiel);
    }
}



