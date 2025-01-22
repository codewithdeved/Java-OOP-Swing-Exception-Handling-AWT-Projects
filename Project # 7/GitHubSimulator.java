import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class GitHubSimulator {

    public void start() throws IOException {

        System.out.println("\nWelcome To The GitHub Simulator!\n\nLOGIN REQUIRED!\n");

        Authentication authentication = new Authentication();

        Scanner scanner = new Scanner(System.in);

        String enterUsername = getInput(scanner, "Enter your username: ");
        while (!enterUsername.equals(authentication.getUsername())) {
            System.err.println("\nInvalid Username. Please try again.");
            enterUsername = getInput(scanner, "\nEnter your username: ");
        }

        String enterPassword = getInput(scanner, "\nEnter your password: ");
        while (!enterPassword.equals(authentication.getPassword())) {
            System.err.println("\nInvalid Password. Please try again.");
            enterUsername = getInput(scanner, "\nEnter your password: ");
        }

        String file = getInput(scanner, "\nCreate a new file with .java extension: ");

        while (!file.endsWith(".java")) {
            System.err.println("\nError: File name must end with a .java extension. Please try again.");
            file = getInput(scanner, "\nCreate a new file with .java extension: ");
        }

        String className = file.substring(0, file.lastIndexOf("."));

        StringBuilder code = new StringBuilder();

        code.append("public class ").append(className).append(" {\n\n");

        code.append("   public static void main(String[] args) {\n\n");

        System.out.println("\nWrite some code in your \"" + file + "\" & (Type 'exit' to finish): \n");

        for (int lineNumbers = 1;; lineNumbers++) {
            System.out.print(lineNumbers + ": ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }
            code.append("       System.out.println(\"" + line + "\");\n\n");
        }

        code.append("   }\n\n");
        code.append("}\n");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(code.toString());
        } catch (Exception e) {
            System.err.println("Error: Failed to write in \"" + file + "\"");
        }

        System.out.println("\nYour file \"" + file + "\" has the following code: \n");
        System.out.println(code.toString());

        String repository = getInput(scanner, "\nCreate a new Repository: ");

        String[] gitCommands = {
                "git init",
                "git add .",
                "git commit -m \"first commit\"",
                "git branch -M main",
                "git remote add origin \"https://github.com/tayyabali20/SecondOpenEndedLab\"",
                "git push -u origin main"
        };

        System.out.println("\nType each of the following commands:\n");

        for (String command : gitCommands) {
            System.out.println(command);
            while (true) {
                String enteredCommand = getInput(scanner, "\nEnter the command: ");
                if (enteredCommand.trim().replace("\"", "").equals(command.trim().replace("\"", ""))) {
                    System.out.println("\nCommand executed successfully \"" + enteredCommand + "\"\n");
                    break;
                } else {
                    System.err.println("\nInvalid \"" + enteredCommand + "\" command. Please try again.");
                }
            }
        }

        System.out.println("\nYour \"" + file
                + "\" with the following code has been successfully pushed to your new GitHub Repository (\""
                + repository + "\").\n");
        System.out.println(code.toString());

    }

    public static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

}