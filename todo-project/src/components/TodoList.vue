<template>
  <table>
    <tr>
      <td>번호</td>
      <td>내용</td>
      <td>달성여부</td>
    </tr>

    <tbody>
      <todo-list-item v-for="(todo, index) in todos" :key="index" :todo="todo"></todo-list-item>
    </tbody>
  </table>
</template>

<script>
import TodoListItem from "@/components/TodoListItem";
import axios from "axios";

export default {
  name: "TodoList",
  components: {
    TodoListItem,
  },

  data() {
    return {
      todos: {}
    }
  },

  created() {
    const url = "http://localhost/todo";
    axios.get(url)
      .then(response => {
        this.todos = response.data;
        console.log(this.todos);
      })
  },
}
</script>

<style>

</style>