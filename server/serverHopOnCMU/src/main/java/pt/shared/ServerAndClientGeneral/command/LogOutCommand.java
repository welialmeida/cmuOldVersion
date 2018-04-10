package pt.shared.ServerAndClientGeneral.command;

import pt.shared.ServerAndClientGeneral.response.Response;

import java.util.TreeMap;

public class LogOutCommand extends Command {

    private static final long serialVersionUID = -8807331723807741905L;
    private String message;
    private String Id = "LogOutCommand";

    @Override
    public String getId() {
        return Id;
    }

    public LogOutCommand(String message, TreeMap<String, Object> argsMap) {
        super(argsMap);
        this.message = message;
    }

    @Override
    public Response handle(CommandHandler chi) {
        return chi.handle(this);
    }

    public String getMessage() {
        return this.message;
    }
}