<template>
  <div>
    <hr>
    <b-table-simple hover small caption-top responsive>
      <b-thead>
        <b-tr>
          <b-td>번호</b-td>
          <b-td>내용</b-td>
          <b-td>달성여부</b-td>
        </b-tr>
      </b-thead>
  
      <b-tbody>
        <todo-list-item v-for="(todo, index) in todos" :key="index" :todo="todo"></todo-list-item>
      </b-tbody>
    </b-table-simple>
    <todo-delete-all></todo-delete-all>
  </div>

</template>

<script>
import TodoListItem from "@/components/TodoListItem"
import TodoDeleteAll from "@/components/TodoDeleteAll"
import http from "@/util/http-common"

export default {
  name: "TodoList",
  components: {
    TodoListItem,
    TodoDeleteAll,
  },

  data() {
    return {
      todos: {},
    }
  },

  created() {
    const url = "http://localhost/todo";

    http.get(url)
      .then(response => {
        this.todos = response.data;
      })
  },
}
</script>

<style>

</style>