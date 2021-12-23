import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ModifierAPage } from './modifier-a.page';

const routes: Routes = [
  {
    path: '',
    component: ModifierAPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ModifierAPageRoutingModule {}
