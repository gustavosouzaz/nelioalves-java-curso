package entidades;

public class Trabalhador {

    private Integer id;
    private String name;
    private Double salary;

    public Trabalhador(Integer id, Double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void increaseSalary(double percentage) {
        salary = salary + salary * percentage / 100.00;
    }

}
