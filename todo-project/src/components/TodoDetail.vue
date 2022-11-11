<template>
  <div class="detail">
    <div class="detail_form">
      <label for="id">ID</label>
      <input type="text" id="id" v-model="todo.id" ref="id" /><br />

      <label for="sdate">시작일</label>
      <input type="date" id="sdate" v-model="todo.sdate" ref="sdate"/><br />

      <label for="edate">종료일</label>
      <input type="date" id="edate" v-model="todo.edate" ref="edate" /><br />

      <div>
        <label for="done">달성여부</label>
        <select id="done" name="done" v-model="todo.done" ref="done">
          <option>Y</option>
          <option>N</option>
        </select>
      </div>

      <label for="content">내용</label>
      <input type="text" id="content" v-model="todo.content" ref="content" /><br />

      <button @click="modify">수정</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
import http from "@/util/http-common"

export default {
  name: "TodoDetail",
  data() {
    return {
      todo: Object,
    }
  },

  methods: {
    modify() {
      this.todo.num = this.$route.params.num;

      http.put("/todo", null, {
        params: this.todo,
      })
        .then(() => this.moveList());
    },

    moveList() {
      this.$router.push({name: "list"});
    }
  },

  created() {
    http.get(`/todo/${this.$route.params.num}`)
      .then(({data}) => {
        this.todo = data;
      });
  }
}
</script>

<style>

</style>