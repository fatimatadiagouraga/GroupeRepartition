import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CreerGroupePage } from './creer-groupe.page';

const routes: Routes = [
  {
    path: '',
    component: CreerGroupePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CreerGroupePageRoutingModule {}
