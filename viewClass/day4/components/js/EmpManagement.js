import empHeader from "./EmpHeader.js";
import empList from "./EmpList.js";
import empSearch from "./EmpSearch.js";

export default {
  components: {
    empHeader,
    empList,
    empSearch,
  },

  template: `<div>
                <emp-header></emp-header>
                <emp-search></emp-search>
                <emp-list></emp-list>
              </div>`,
}