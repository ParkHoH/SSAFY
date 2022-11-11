<template>
  <button @click="deleteAll()">전체 삭제</button>
</template>

<script>
import http from "@/util/http-common"

export default {
  name: "TodoDeleteAll",
  methods: {
    deleteAll() {
      // alert("정말 지우시겠습니까?");
      http.delete(`/todos`)
        .then(() => this.$router.go(this.$router.currentRoute));
    }
  }
}
</script>

<style>

</style>