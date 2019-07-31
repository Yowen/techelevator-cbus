import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home.vue'
import Personal from "@/views/Personal.vue";
import Work from "@/views/Work.vue";
import House from "@/views/House.vue";

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: "/personal",
      name: "personal",
      component: Personal
    },
    {
      path: "/work",
      name: "work",
      component: Work
    },
    {
      path: "/house",
      name: "house",
      component: House
    }
  ]
})
