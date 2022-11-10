<template>
  <tr>
    <th>{{todo.num}}</th>
    <th>{{todo.content}}</th>
    <th>{{todo.done}}</th>
  </tr>
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