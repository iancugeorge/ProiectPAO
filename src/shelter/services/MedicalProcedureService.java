package shelter.services;

public class MedicalProcedureService {
    private static MedicalProcedureService ourInstance = new MedicalProcedureService();

    private MedicalProcedureService() {
    }

    public static MedicalProcedureService getInstance() {
        return ourInstance;
    }


}
