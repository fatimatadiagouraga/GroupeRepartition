import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GroupeDetPage } from './groupe-det.page';

const routes: Routes = [
  {
    path: '',
    component: GroupeDetPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GroupeDetPageRoutingModule {}
