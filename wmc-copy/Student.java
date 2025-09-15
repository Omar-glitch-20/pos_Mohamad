
public class Student
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Constructor (mit gender)
    public Student (String name, float kg, int cm, char gender) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }

    // setter für name
    public void setName (String name) {
        this.name = name;
    }

    // setter für kg
    public void setKg (float kilogramm) {
        this.kg = kilogramm;
    }

    // setter für cm
    public void setCm (int cm) {
        this.cm = cm;
    }

    // setter für gender
    public void setGender (char gender) {
        this.gender = gender;
    }

    // calculate bmi
    public float bmi () {
        return this.kg / ((this.cm / 100.0f) * (this.cm / 100.0f));
    }

    // Geschlecht als String
    public String mannOderFrau () {
        if (this.gender == 'm' || this.gender == 'M') return "männlich";
        if (this.gender == 'w' || this.gender == 'W') return "weiblich";
        return "unbekannt";
    }

    // Gewichtskategorie nach BMI
    public String gewichtKategorie() {
        float bmi = this.bmi();
        if (bmi < 18.5f) return "Untergewicht";
        else if (bmi < 25) return "Normalgewicht";
        else return "Übergewicht";
    }

    // Ausgabe
    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + "), " 
            + this.kg + "kg, " + this.cm + "cm (" + this.gewichtKategorie() + ")";
    }
}


