public interface ICommand {
    void execute();
    void undo();
    void saveBackup();
}