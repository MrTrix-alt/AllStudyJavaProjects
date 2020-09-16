package edu.java.project.studentorder.domain;

public class CityRegisterCheckerResponse
{
    // флажок на проверку существует ли человек или нет
    private boolean existing;
    // Флажок временной/постоянной регистрации
    private Boolean temporal;

    public boolean isExisting()
    {
        return existing;
    }

    public void setExisting(boolean existing)
    {
        this.existing = existing;
    }

    public Boolean getTemporal()
    {
        return temporal;
    }

    public void setTemporal(Boolean temporal)
    {
        this.temporal = temporal;
    }

    @Override
    public String toString()
    {
        return "CityRegisterCheckerResponse {" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
