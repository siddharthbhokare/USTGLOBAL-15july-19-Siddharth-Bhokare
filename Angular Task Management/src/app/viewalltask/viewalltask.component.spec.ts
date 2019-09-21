import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewalltaskComponent } from './viewalltask.component';

describe('ViewalltaskComponent', () => {
  let component: ViewalltaskComponent;
  let fixture: ComponentFixture<ViewalltaskComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewalltaskComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewalltaskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
