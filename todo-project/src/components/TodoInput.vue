<template>
  <!-- <div>
    <input type="search" placeholder="번호를 입력해주세요"/>
    <button>검색</button>
  </div> -->
  <div class="regist">
    <!-- <h1 class="underline">Todo 등록</h1> -->
    <div class="regist_form">
      <label for="id">ID</label>
      <input type="text" id="id" v-model="id" ref="id" /><br />

      <label for="sdate">시작일</label>
      <input type="date" id="sdate" v-model="sdate" ref="sdate" /><br />

      <label for="edate">종료일</label>
      <input type="date" id="edate" v-model="edate" ref="edate" /><br />

      <div>
        <label for="done">달성여부</label>
        <select id="done" name="done" v-model="done" ref="done">
          <option>Y</option>
          <option>N</option>
        </select>
      </div>

      <label for="content">내용</label>
      <input type="text" id="content" v-model="content" ref="content" /><br />

      <button @click="register">등록</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
import http from "@/util/http-common"

export default {
  name: "TodoInput",
  data() {
    return {
      id: '',
      content: '',
      sdate: '',
      edate: '',
      done: '',
    }
  },

  methods: {
    register() {
      let todo = {
        id: this.id,
        content: this.content,
        sdate: this.sdate,
        edate: this.edate,
        done: this.done,
      }

      http.post("/todo", null, {
        params: todo,
      })
        .then(() => this.moveList());
    },

    moveList() {
      this.$router.push({name: "list"});
    }
  },
}
</script>

<style>

</style>