public class Lab {
    private String labId;
    Computer computers[];
    LabStatus status;
    Employee labAttendant;
    int computerCount=0;

    public Lab() {
        // Set default values
        this.labId = "DefaultLab";
        this.computers = new Computer[0];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = null;
    }

    public Lab(String labId, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labId = labId;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }
    public void addComputer(Computer computer) {
        if (computerCount < computers.length) {
            computers[computerCount++] = computer;
        } else {
            System.out.println("Lab is at full capacity. Cannot add more computers.");
        }
    }


    public void removeComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == computer) {
                computers[i] = null;
                break;
            }
        }
    }

    public void changeStatus(LabStatus newStatus){
        status = newStatus;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public Computer getComputerByNumber(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getLcdNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }
}