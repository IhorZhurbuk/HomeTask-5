import java.util.Date;

class Student {

    private static int id;
    private String name;
    private String surname;
    private String secondname;
    private Date bithrday;
    private String adres;
    private int tel;
    private String fakultet;
    private int kurs;
    private String gruppa;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", bithrday=" + bithrday +
                ", adres='" + adres + '\'' +
                ", tel=" + tel +
                ", fakultet='" + fakultet + '\'' +
                ", kurs=" + kurs +
                ", gruppa='" + gruppa + '\'' +
                '}';
    }


    public Student(int id, String surname, String name, String secondname, Date bithrday, String adres, int tel, String fakultet, int kurs, String gruppa) {
        Student.id = id;
        this.surname = surname;
        this.name = name;
        this.secondname = secondname;
        this.bithrday = bithrday;
        this.adres = adres;
        this.tel = tel;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getAdres() {
        return adres;
    }

    public Date getBithrday() {
        return bithrday;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getGruppa() {
        return gruppa;
    }

    public static int getId() {
        return id;
    }

    public int getKurs() {
        return kurs;
    }

    public String getName() {
        return name;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getSurname() {
        return surname;
    }

    public int getTel() {
        return tel;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setBithrday(Date bithrday) {
        this.bithrday = new Date();
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtchestva(String otchestva) {
        this.secondname = otchestva;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}

