import java.util.Objects;

public class Man {
    private String fullName;
    private String eyesColor;
    private String hairColor;
    private int dnaCode;

    public Man(String fullName, String eyesColor, String hairColor, int dnaCode) {
        this.fullName = fullName;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.dnaCode = dnaCode;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    public void setDnaCode(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnaCode);
    }

    @Override
    public String toString() {
        return "Man{" +
                "full name='" + fullName + '\'' +
                ", eyes color='" + eyesColor + '\'' +
                ", hair color='" + hairColor + '\'' +
                ", dna code=" + dnaCode +
                '}';
    }
}