import Vue from 'vue'
import VueRouter from 'vue-router'
// import HomeView from '../views/HomeView.vue'
import TodoList from '@/components/TodoList'
import TodoInput from '@/components/TodoInput'
import TodoDetail from '@/components/TodoDetail'
// import TodoDeleteAll from '@/components/TodoDeleteAll'

Vue.use(VueRouter)

const routes = [
  {
    path: '/list',
    name: 'list',
    component: TodoList,
  },
  {
    path: '/input',
    name: 'input',
    component: TodoInput,
  },
  {
    path: '/detail/:num',
    name: 'detail',
    component: TodoDetail,
  },
  // {
  //   path: '/deleteall',
  //   name: 'deleteall',
  //   component: TodoDeleteAll,
  // }

  // {
  //   path: '/',
  //   name: 'home',
  //   component: HomeView
  // },
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
