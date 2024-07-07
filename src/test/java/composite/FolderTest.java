package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FolderTest {
    @Test
    void shouldReturnPeriodFolder() {
        Directory directory1 = new Directory("Human Resources");

        Directory directory2 = new Directory("Full Program");
        File file21 = new File("Knapsack problem - simplex", "Knapsack problem ");
        directory2.addComponent(file21);

        Directory directory3 = new Directory("LP V");
        File file31 = new File("Car example for builder pattern", "Builder ");
        File file32 = new File("Administrator example for singleton pattern", "Singleton ");
        directory3.addComponent(file31);
        directory3.addComponent(file32);

        Directory period = new Directory("7th period - BSI");
        period.addComponent(directory1);
        period.addComponent(directory2);
        period.addComponent(directory3);

        Folder folder = new Folder();
        folder.setContent(period);

        assertEquals("Directory: 7th period - BSI\n" +
                "Directory: Human Resources\n" +
                "Directory: Full Program\n" +
                "Directory (name): Knapsack problem description: Knapsack problem - simplex\n" +
                "Directory: LP V\n" +
                "Directory (name): Builder description: Car example for builder pattern\n" +
                "Directory (name): Singleton description: Administrator example for singleton pattern\n", folder.getContent());
    }

    @Test
    void shouldThrowExceptionForFolderWithoutPeriod() {
        try {
            Folder folder = new Folder();
            folder.getContent();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Folder without content", e.getMessage());
        }
    }
}
