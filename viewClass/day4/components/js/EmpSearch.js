import bus from "./EmpBus.js";

export default {
  data() {
    return {
      name: "",
    }
  },
  
  methods: {
    search() {
      bus.$emit('search-emp', this.name);
      this.name = "";
    }
  },
  
  template: `<div>
              <input type="search" placeholder="사원 아이디" v-model="name" @keyup.enter="search">
              <button @click="search">검색</button>
            </div>`,
  
}