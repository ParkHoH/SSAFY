<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png" />

    <todo-header></todo-header>
    <router-view></router-view>
    <!-- <todo-input></todo-input>
    <todo-list></todo-list>
    <todo-footer></todo-footer> -->
  </div>
</template>

<script>
import TodoHeader from "@/views/TheTodoHeader";
// import TodoInput from "@/components/TodoInput";
// import TodoList from "@/components/TodoList";
// import TodoFooter from "@/components/TodoFooter";

export default {
  name: "app",
  components: {
    TodoHeader,
    // TodoInput,
    // TodoList,
    // TodoFooter,
  }
}

</script>

<style>
* {
  margin: auto;
  text-align: center;
}

</style>
