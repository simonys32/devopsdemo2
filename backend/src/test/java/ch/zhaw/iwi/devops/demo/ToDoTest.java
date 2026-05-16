package ch.zhaw.iwi.devops.demo;

  import static org.junit.jupiter.api.Assertions.assertEquals;

  import org.junit.jupiter.api.Test;

  public class ToDoTest {

      @Test
      public void testToDo() {
          var toDo1 = new ToDo(1, "title", "description");
          assertEquals("title", toDo1.getTitle());
          assertEquals("description", toDo1.getDescription());
          assertEquals(1, toDo1.getId());
      }

      @Test
      void testToDoTitle() {
          ToDo todo = new ToDo(2, "new title", "new description");
          assertEquals("new title", todo.getTitle());
      }
  }
