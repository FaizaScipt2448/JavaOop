public class University {
    Lab lab[];
    public Lab getLabById(String Id) {
        for (Lab labs : lab) {
            if (lab != null && labs.getLabId().equals(Id)) {
                return labs;
            }
        }
        return null;
    }
}