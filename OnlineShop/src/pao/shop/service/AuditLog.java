package pao.shop.service;

public  class AuditLog {
    // calea catre fisierul de log actiuni
    private static String filePath;

    public static void logAction(String nameOfAction) {
        // se scrie cu append

    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


}
