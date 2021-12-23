import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TravailDetPage } from './travail-det.page';

const routes: Routes = [
  {
    path: '',
    component: TravailDetPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TravailDetPageRoutingModule {}
