import Application;
import editor.Editor;

public class UndoCommand extends Command {
    private ICommand commandBackup;

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        super.execute();
        if (commandBackup != null) commandBackup.undo();
    }

    @Override
    public void undo() {
        if (commandBackup != null) commandBackup.execute();
    }

    @Override
    public void saveBackup() {
        commandBackup = app.getLastCommand();
    }
}