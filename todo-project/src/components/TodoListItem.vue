<template>
  <b-tr>
    <b-td><router-link :to="`/detail/${todo.num}`">{{todo.num}}</router-link></b-td>
    <b-td>{{todo.content}}</b-td>
    <b-td>{{todo.done}}</b-td>
  </b-tr>
</template>

<script>
export default {
  name: "TodoListItem",
  props: {
    todo: Object,
  }
}
</script>

<style>

</style>