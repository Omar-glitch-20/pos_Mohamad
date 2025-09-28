package StudentTest;

public class Student
{
    // Attribute (Eigenschaften eines Studenten)
    private String name;   // Name des Studenten
    private float kg;      // Gewicht in Kilogramm
    private int cm;        // Körpergröße in Zentimetern
    private char gender;   // Geschlecht: 'm' oder 'w'

    // --------------------------------------------------------
    // Default-Konstruktor
    // Wenn man keinen Wert angibt, werden Standardwerte gesetzt.
    public Student() {
        this("Unbekannt", 70, 170, 'm');  
        // ruft den anderen Konstruktor auf
        // Name = "Unbekannt", Gewicht = 70kg, Größe = 170cm, Gender = 'm'
    }

    // --------------------------------------------------------
    // Konstruktor mit Parametern
    // Wird aufgerufen, wenn man beim Erstellen Werte übergibt
    public Student (String name, float kg, int cm, char gender) {
        this.setName(name);   // ruft den Setter für Name auf
        this.setKg(kg);       // ruft den Setter für Gewicht auf
        this.setCm(cm);       // ruft den Setter für Größe auf
        this.setGender(gender); // ruft den Setter für Geschlecht auf
    }

    // --------------------------------------------------------
    // Setter für Name mit Parameterprüfung
    public void setName (String name) {
        if (name == null || name.trim().isEmpty()) {
            // wenn Name null oder leer ist → Fehler werfen
            throw new IllegalArgumentException("Name darf nicht leer sein!");
        } else {
            this.name = name; // gültiger Name → speichern
        }
    }

    // Setter für Gewicht (kg)
    public void setKg (float kilogramm) {
        if (kilogramm <= 0) {
            throw new IllegalArgumentException("Gewicht muss größer als 0 sein!");
        } else {
            this.kg = kilogramm;
        }
    }

    // Setter für Körpergröße (cm)
    public void setCm (int cm) {
        if (cm <= 0) {
            throw new IllegalArgumentException("Größe muss größer als 0 sein!");
        } else {
            this.cm = cm;
        }
    }

    // Setter für Geschlecht (gender)
    public void setGender (char gender) {
        if (gender == 'm' || gender == 'M' || gender == 'w' || gender == 'W') {
            this.gender = gender; // nur m oder w erlaubt
        } else {
            throw new IllegalArgumentException("Gender muss 'm' oder 'w' sein!");
        }
    }

    // --------------------------------------------------------
    // BMI berechnen (kg / (m²))
    public float bmi () {
        // cm → m umrechnen → durch 100 teilen
        return this.kg / ((this.cm / 100.0f) * (this.cm / 100.0f));
    }

    // --------------------------------------------------------
    // Geschlecht als String zurückgeben
    public String mannOderFrau () {
        if (this.gender == 'm' || this.gender == 'M') {
            return "männlich";
        } else if (this.gender == 'w' || this.gender == 'W') {
            return "weiblich";
        } else {
            return "unbekannt";
        }
    }

    // --------------------------------------------------------
    // Gewichtskategorie ausgeben anhand des BMI
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

    // --------------------------------------------------------
    // Ausgabe als String
    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + "), " 
            + this.kg + "kg, " + this.cm + "cm (" + this.gewichtKategorie() + ")";
    }

    // --------------------------------------------------------
    // Zusätzliche Methode: gibt die Infos direkt aus
    public void printStudent() {
        System.out.println(this.toString());
    }
}
