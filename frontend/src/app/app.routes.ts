import { Routes } from '@angular/router';
import { Login } from './login/login';
import { Admin } from './admin/admin';
import {Vote} from './vote/vote';

export const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'login' },
  { path: 'login', component: Login },
  { path: 'admin', component: Admin},
  { path: 'vote', component: Vote}
];
