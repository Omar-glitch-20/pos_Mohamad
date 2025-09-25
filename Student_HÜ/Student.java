public class Student
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Default-Konstruktor
    public Student() {
        this("Unbekannt", 70, 170, 'm');  // sinnvolle Standardwerte
    }

    // Konstruktor mit Parametern
    public Student (String name, float kg, int cm, char gender) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }

    // setter für name
    public void setName (String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein!");
        } else {
            this.name = name;
        }
    }

    // setter für kg
    public void setKg (float kilogramm) {
        if (kilogramm <= 0) {
            throw new IllegalArgumentException("Gewicht muss größer als 0 sein!");
        } else {
            this.kg = kilogramm;
        }
    }

    // setter für cm
    public void setCm (int cm) {
        if (cm <= 0) {
            throw new IllegalArgumentException("Größe muss größer als 0 sein!");
        } else {
            this.cm = cm;
        }
    }

    // setter für gender
    public void setGender (char gender) {
        if (gender == 'm' || gender == 'M' || gender == 'w' || gender == 'W') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender muss 'm' oder 'w' sein!");
        }
    }

    // calculate bmi
    public float bmi () {
        return this.kg / ((this.cm / 100.0f) * (this.cm / 100.0f));
    }

    // Geschlecht als String
    public String mannOderFrau () {
        if (this.gender == 'm' || this.gender == 'M') {
            return "männlich";
        } else if (this.gender == 'w' || this.gender == 'W') {
            return "weiblich";
        } else {
            return "unbekannt";
        }
    }

    // Gewichtskategorie nach BMI
    public String gewichtKategorie() {
        float bmi = this.bmi();
        if (bmi < 18.5f) {
            return "Untergewicht";
        } else if (bmi < 25) {
            return "Normalgewicht";
        } else {
            return "Übergewicht";
        }
    }

    // Ausgabe
    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + "), " 
            + this.kg + "kg, " + this.cm + "cm (" + this.gewichtKategorie() + ")";
    }

    // printStudent-Methode (z. B. für eine Liste)
    public void printStudent() {
        System.out.println(this.toString());
    }
}
